multibranchPipelineJob('demo') {
    branchSources {
        git {
            remote('https://github.com/mattyait/devops_continous_integeration.git')
            credentialsId('github-ci')
            includes('JENKINS-*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
