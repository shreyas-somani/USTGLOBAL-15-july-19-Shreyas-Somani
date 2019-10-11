import { Injectable } from '@angular/core';

@Injectable({
    providedIn:"root"
     
})
//if provided is given service will be available for each and every component
//nead not declare for all components
export class UserService{

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