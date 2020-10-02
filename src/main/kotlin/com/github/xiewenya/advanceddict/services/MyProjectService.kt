package com.github.xiewenya.advanceddict.services

import com.intellij.openapi.project.Project
import com.github.xiewenya.advanceddict.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
