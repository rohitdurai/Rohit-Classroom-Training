import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employeeinfo',
  templateUrl: './employeeinfo.component.html',
  styleUrls: ['./employeeinfo.component.css']
})
export class EmployeeinfoComponent implements OnInit {

  employees = [
    {
      id:1,
      name: "Rashmi",
      gender: 'Female',
      ContactPreference: 'Email',
      email:'rashmi@gmail.com',
      dateOfBirth: new Date('10/25/1988'),
      department:'IT',
      isActive: true,
      photoPath: 'assets/images/rash.png'

  },
  {
    id:2,
    name: "Anushka",
    gender: 'Female',
    ContactPreference: 'Phone',
    phoneNumber: 1258965214,
    dateOfBirth: new Date('11/20/1979'),
    department:'HR',
    isActive: true,
    photoPath: 'assets/images/anu.png'

  },
  {
    id:3,
    name: "Parth",
    gender: 'Male',
    ContactPreference: 'Phone',
    phoneNumber: 9896582458,
    dateOfBirth: new Date('3/26/1976'),
    department:'IT',
    isActive: false,
    photoPath: 'assets/images/parth.png'
  }
]


  constructor() { }

  ngOnInit() {
  }

}
