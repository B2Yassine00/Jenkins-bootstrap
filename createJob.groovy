pipelineJob('createJob') {
    definition {
        cps {
            script(readFileFromWorkspace('createJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('YaaKhayerBackendJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/B2Yassine00/YAA-Khayer/tree/branch-DEV/BackEnd-no-context/yaa-khayer.git'
                    }
                    branch 'branch-DEV'
                }
            }
        }
    }
}

pipelineJob('YaaKhayerFrontJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/B2Yassine00/YAA-Khayer/tree/branch-DEV/Frontend/yaa-khayer-front.git'
                    }
                    branch 'branch-DEV'
                }
            }
        }
    }
}