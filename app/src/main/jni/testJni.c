//
// Created by lqx on 2020-02-29.
//

#include "com_jniprojectcmake_Util.h"

JNIEXPORT jstring JNICALL Java_com_jniprojectcmake_Util_print
        (JNIEnv *env, jclass thiz){
    return (*env)->NewStringUTF(env,"hello world");
}