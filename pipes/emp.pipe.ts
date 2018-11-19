import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'emp'
})
export class EmpPipe implements PipeTransform {

  transform(value: string, gender: string): string {
    if (value == "Male"){
      return "Mr."+value
    }else{
      return "Mrs."+value
    }

  }

}
