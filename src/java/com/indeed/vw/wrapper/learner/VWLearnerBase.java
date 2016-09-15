package com.indeed.vw.wrapper.learner;

/**
 * This abstract base class allows the authors of new model wrappers to just write
 * java code like the following:
 *
 * <pre>
 * {@code
 * public final class SomeLearner extends VWLearnerBase<float[]> {
 *   VWFloatArrayLearner(String command) { super(command); }
 *   protected native float[] predict(String example, boolean learn, long nativePointer);
 * }
 * }
 * </pre>
 *
 * Then the author can simply concentrate on writing the <em>JNI</em> C code.
 *
 * @author deak
 */
abstract class VWLearnerBase<T> extends VWBase implements VWTypedLearner<T> {
    VWLearnerBase(final long nativePointer) {
        super(nativePointer);
    }

    @Override
    public final T learn(final String example) {
        return learnOrPredict(example, true);
    }

    @Override
    public final T predict(final String example) {
        return learnOrPredict(example, false);
    }

    protected abstract T predict(String example, boolean learn, long nativePointer);

    private T learnOrPredict(final String example, final boolean learn) {
        lock.lock();
        try {
            if (isOpen()) {
                return predict(example, learn, nativePointer);
            }
            throw new IllegalStateException("Already closed.");
        }
        finally {
            lock.unlock();
        }
    }
}
