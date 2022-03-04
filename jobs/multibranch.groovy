multibranchPipelineJob('example') {
  branchSources {
    git {
      // ...
    }
  }
  factory {
    remoteJenkinsFileWorkflowBranchProjectFactory {
      remoteJenkinsFile(scriptPath)
      localMarker('') /* everything is valid */
      remoteJenkinsFileSCM {
        gitSCM {
          userRemoteConfigs	{
            userRemoteConfig {
              name('origin')
              url('https://github.com/btotharye/python-jenkins-test.git')
              refspec("+refs/heads/main:refs/remotes/origin/main")
            }
          }
          branches {
            branchSpec {
              name('main')
            }
          }
          browser {} // required, but doesn't require configuration
          gitTool('git') // or wherever makes sense
        }
      }
    }
  }
}