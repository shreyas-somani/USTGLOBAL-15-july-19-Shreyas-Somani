import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }
  
  users=[
    {
        name:'s1',
        company:'UST Global'
    },
    {
        name:'s2',
        company:'UST Global'
        
    },
    {
        name:'sagar',
        company:'UST Global'
    }
]
}
