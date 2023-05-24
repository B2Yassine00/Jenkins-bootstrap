pipelineJob('createJob') {
    definition {
        cps {
            script(readFileFromWorkspace('createJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('YaaKhayerJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/B2Yassine00/YAA-Khayer.git'
                    }
                    branch 'branch-DEV'
                }
            }
        }
    }
}