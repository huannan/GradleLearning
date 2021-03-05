package com.nan.myplugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('taskFromPlugin') {
            doLast {
                println "自定义插件任务"
            }
        }
    }
}