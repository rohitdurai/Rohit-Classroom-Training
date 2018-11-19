import { Component, OnInit } from '@angular/core';
import { Employee } from '../Model/employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  name = "Employee Information";
  firstName = "Rohit";
  lastName = "Durai"
  gender = "Male";
  Age = 30;

  showFaculty:boolean = true  ;
  Faculty:string = "Anil Gupta";

  Subjects: string[] = ["MS.NET", "Java", "SharePoint"];

  employees: any[] = [
    {
      code: 'emp101', name: 'Rashmi', gender: 'Female',
      annualSalary: 5500, dateOfBirth: '25/6/1985'
    },
    {
      code: 'emp102', name: 'Anushka', gender: 'Female',
      annualSalary: 5700.52, dateOfBirth: '9/6/1982'
    },
    {
      code: 'emp103', name: 'Parth', gender: 'Male',
      annualSalary: 5800.95, dateOfBirth: '15/6/1984'
    }
  ];

  emp: Employee = new Employee(1,'Emp1', 10000);

  constructor() { }

  ngOnInit() {
  }

  getFullName(): string{
    // return this.firstName+" "+this.lastName;

    return "Full Name: ".concat(this.firstName.concat(" "+this.lastName));
  }
}
