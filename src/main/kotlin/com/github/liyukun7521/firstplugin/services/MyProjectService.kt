package com.github.liyukun7521.firstplugin.services

import com.intellij.openapi.project.Project
import com.github.liyukun7521.firstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
