#!/usr/bin/env groovy
@Library('common-library')

//定义包ID, name和路径
def APPS = [
	['ops-facade-erp','ops-facade-erp','target/ops-facade-erp-*.zip']
]

//定义构建的参数
def buildMapParams=[:]
//构建pom所在目录
buildMapParams.pomDir='.'
buildMapParams.mvnCommand='mvn -U clean install deploy'

pipeline {
    agent any
    tools {
        maven 'mvn3'
        jdk 'jdk8'
    }
	
    stages {
       stage('构建') {
	        steps {
			    commonBuild(buildMapParams)
			}   
    	}
    }
}
