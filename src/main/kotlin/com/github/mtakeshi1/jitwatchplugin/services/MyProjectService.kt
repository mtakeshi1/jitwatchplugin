package com.github.mtakeshi1.jitwatchplugin.services

import com.intellij.openapi.project.Project
import com.github.mtakeshi1.jitwatchplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
