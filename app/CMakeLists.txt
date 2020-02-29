cmake_minimum_required(VERSION 3.4.1)

# 使用安卓log日志
find_library( # Sets the name of the path variable.
              log-lib
              log )

# 设置引用第三方so的路径  ${CMAKE_SOURCE_DIR}代表和CMakeLists.txt文件同级目录
set(distribution_DIR ${CMAKE_SOURCE_DIR}/libs)
# 导入第三方头文件需要在这指明,比如在jni中添加第三方的头文件
include_directories(src/main/jni)

# 添加和src同级目中libs的so库,其中fmod是so库的名字
add_library( fmod
             SHARED
             IMPORTED )
set_target_properties( fmod
                       PROPERTIES IMPORTED_LOCATION
                       ${distribution_DIR}/${ANDROID_ABI}/libfmod.so )

# 添加和src同级目中libs的so库,其中fmodL是so库的名字
add_library( fmodL
             SHARED
             IMPORTED )
set_target_properties( fmodL
                       PROPERTIES IMPORTED_LOCATION
                       ${distribution_DIR}/${ANDROID_ABI}/libfmodL.so )
add_library( print
             SHARED
        src/main/jni/testJni.c)

# 将所有的so关联,在这关联后还要将下面所有so在Java代码中load一遍
#target_link_libraries( print fmod fmodL
#       ${log-lib} )
target_link_libraries( print
                       ${log-lib} )
