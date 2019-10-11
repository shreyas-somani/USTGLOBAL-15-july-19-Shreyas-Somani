import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {
  bikeData: any='';
  constructor() { }
  bikes=[
    {
      brand:'KTM',
      img:'http://www.hdnicewallpapers.com/Walls/Normal/Bikes/KTM_RC_200_Sport_Bike_HD_Wallpaper.jpg',
      description:'KTM AG is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto.'
    },

    {
      brand:'Royal Enfield',
      img:'https://wallpapercave.com/wp/wp1925026.jpg',
      description:'Royal Enfield was a brand name under which The Enfield Cycle Company Limited of Redditch, Worcestershire sold motorcycles, bicycles, lawnmowers and stationary engines which they had manufactured. Enfield Cycle Company also used the brand name Enfield without Royal. The first Royal Enfield motorcycle was built in 1901.'
    },
    {
      brand : 'TVS Apache',
      img :'https://imgd.aeplcdn.com/1280x720/bw/models/tvs-apache-rtr-160-4v.jpg?20190103151915&q=80',
      description:'The TVS Apache is a brand of motorcycle made by TVS Motors since 2006. In 2008 the company claimed that more than 2.5 million Apaches were on the road.[1] Currently the company sells five variants of the TVS Apache. The differences between each variant being the engine displacement, the options on offer and performance characteristics. The abbreviation RTR in the names of the motorcycles refer to Racing Throttle Response',

    },
    {
      brand :'Bajaj Dominor',
      img:'https://auto.ndtvimg.com/bike-images/big/bajaj/dominar-400/bajaj-dominar-400.webp?v=31',
      description:'Bajaj Auto Limited is an Indian global two-wheeler company and three-wheeler manufacturing company headquartered in Pune, Maharashtra.[2] It manufactures motorcycles, scooters and auto rickshaws. Bajaj Auto is a part of the Bajaj Group. It was founded by Jamnalal Bajaj in Rajasthan in the 1940s. It is based in Pune, Maharashtra, with plants in Chakan (Pune), Waluj (near Aurangabad) and Pantnagar in Uttarakhand.[3] The oldest plant at Akurdi (Pune) now houses the R&D centre Ahead.      Bajaj Auto is the worlds third-largest manufacturer of motorcycles and the second-largest in India.[4] It is the worlds largest three-wheeler manufacturer.[5]   On May 2015, its market capitalisation was ₹640 billion (US$9.3 billion), making it Indias 23rd largest publicly traded company by market value.[6] The Forbes Global 2000 list for the year 2012 ranked Bajaj Auto at 1,416.'

    },
    {
      brand : 'Hero Splender',
      img:'https://www.drivespark.com/bikes-photos/modelsoverview/600x450/43/hero-splendor-plus-review-design-and-style.jpg/3/',
      description:'Hero Splendor Plus Highlights In terms of features, it gets Heros i3S engine start-stop technology, which helps increase the overall efficiency, and AHO (Always Headlamp On). The commuter motorcycle is powered by a 97.2cc, air-cooled, single cylinder motor, which produces 8.36PS at 8000rpm and 8.05Nm at 5000rpm.'

    }
  ];
  sendBike(bike){
    this.bikeData=bike;
  }

  ngOnInit() {
  }

}
