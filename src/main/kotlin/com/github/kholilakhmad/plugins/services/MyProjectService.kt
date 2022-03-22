package com.github.kholilakhmad.plugins.services

import com.intellij.openapi.project.Project
import com.github.kholilakhmad.plugins.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
