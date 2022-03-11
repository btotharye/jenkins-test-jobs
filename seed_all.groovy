
   
job('Seed All') {
  scm {
    git ('https://github.com/btotharye/jenkins-test-jobs.git')
  }
  steps {
    dsl {
      external('jobs/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}