/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_indeed_vw_wrapper_learner_VWProbLearner */

#ifndef _Included_com_indeed_vw_wrapper_learner_VWProbLearner
#define _Included_com_indeed_vw_wrapper_learner_VWProbLearner
#ifdef __cplusplus
extern "C"
{
#endif
/*
 * Class:     com_indeed_vw_wrapper_learner_VWProbLearner
 * Method:    predict
 * Signature: (Ljava/lang/String;ZJ)F
 */
JNIEXPORT jfloat JNICALL Java_com_indeed_vw_wrapper_learner_VWProbLearner_predict
(JNIEnv *, jobject, jstring, jboolean, jlong);

/*
 * Class:     com_indeed_vw_wrapper_learner_VWProbLearner
 * Method:    predictMultiline
 * Signature: ([Ljava/lang/String;ZJ)F
 */
JNIEXPORT jfloat JNICALL Java_com_indeed_vw_wrapper_learner_VWProbLearner_predictMultiline
(JNIEnv *, jobject, jobjectArray, jboolean, jlong);

#ifdef __cplusplus
}
#endif
#endif
