package com.github.jashion666.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.jashion666.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
