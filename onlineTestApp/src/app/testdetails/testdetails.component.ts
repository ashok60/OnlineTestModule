import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Test } from '../model/test'
import { TestService } from '../service/testservice';

@Component({
  selector: 'app-testdetails',
  templateUrl: './testdetails.component.html',
  styleUrls: ['./testdetails.component.css']
})
export class TestdetailsComponent {

  constructor(private testService:TestService) { 
  
  }
  test:Test;




  findTest(form:any){
    let data=form.value;
    let id=data.testid;
    let observable:Observable<Test>= this.testService.getTest(id);
    observable.subscribe(
      testArg=>{this.test=testArg},
      error=>{
        console.log("error inside test details component"+error.message)
      }
    );
     
   }

}



