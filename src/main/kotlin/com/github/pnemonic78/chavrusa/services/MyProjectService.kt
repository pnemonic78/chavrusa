package com.github.pnemonic78.chavrusa.services

import com.intellij.openapi.project.Project
import com.github.pnemonic78.chavrusa.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
