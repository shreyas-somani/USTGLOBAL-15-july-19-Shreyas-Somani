document.getElementById('tableid').innerHTML= `

<h4>Ordered List1-Languages</h4>
<ol>
    <li>Javascript</li>
    <li>Python</li>
    <li>Java</li>
    <li>c</li>
    <li>cpp</li>
    <li>PHP</li>
    <li>Swift</li>
    <li>C#</li>
    <li>Ruby</li>
    <li>Objective-C</li>
</ol>
<h4>Ordered List2-Nifty</h4>
<ol>
<li>
Asian Paints Ltd
</li>
<li>Axis Bank</li>
<li>Bajaj Auto</li>
<li>Bajaj Finance</li>
<li>Bajaj Finserv</li>
<li>Bharti Airtel</li>
<li>Bharti Infratel Ltd</li>
<li>BPCL</li>
<li>Britannia Industries</li>
<li>Cipla</li>
<li>Coal India</li>
<li>GAIL</li>
<li>Grasim Industries</li>
<li>HCL Technologies</li>
<li>HDFC</li>
<li>HDFC Bank</li>
<li>Hero MotoCorp</li>
<li>Hindalco Industries</li>
<li>Hindustan Unilever</li>
<li>ICICI Bank</li>
<li>Indiabulls Housing Finance</li>
<li>IndusInd Bank</li>
<li>Infosys</li>

</ol>

<h4>Unordered List1-Ear Parts</h4>
<ul>
<li>Eustachian tube</li>
<li>Cochlea</li>
<li>Vestibule</li>
<li>Semi circular canals</li>
<li>Oval Window</li>
</ul>

<h4>Unordered List2-Sholder Parts</h4>
<ul>
   <li>Acromion </li> 
   <li>Coracnoid Process</li>  
    <li> Scapular notch</li>
    <li>supraglenoid tubercle</li> 
    <li>Glenoid cavity</li> 
</ul>
<h4> Mixed List1-Fruits</h4>
<ol>

   <li>Apples</li>
   <li>Apricots</li>
   <li>Avocados</li>
   <li>Bananas</li>
   <li>Boysenberries</li>
   <li>Blueberries</li>
   <li>Bing Cherry</li>
   <li>Cherries</li>
   <li>Crab apples</li>
   <li>Clementine</li>
    <ul>
        <li>Cucumbers</li>
        <li>Damson plum</li>
        <li>Dinosaur Eggs (Pluots)</li>
        <li>Dates</li>
        <li>Dewberries</li>
        <li>Dragon Fruit</li>
        <li>Elderberry</li>
        <li>Eggfruit</li>
        <li>Evergreen Huckleberry</li>
        <li>Entawak</li>
    </ul>
</ol>
`;

document.getElementById('form').innerHTML=`
<h4 id="h4">Form</h4>
<form action="#" method="get">
    <fieldset>
        <label for="username"><b> Name : </b></label>
        <input id="s3" type="text" name="username" id="username" minlength="8">
        <br>
        <br>
        <label for="age"><b> Age :</b> </label>
        <input id="s2"  type="number" name="age" id="age" max="100" min="1">
        <br>
        <br>
        <div ><label for="address"><b> Address : </b></label></div> 
        <textarea id="s1"  name="address" id="address" cols="30" rows="10" placeholder="Enter your address here"></textarea>
        <br>
        <br>
        <label for="DOB"><b> Date of Birth :</b> </label>
        <input id="space" type="date" name="DOB" id="DOB" >
        <br>
        <br>
        <label for="emailid"><b> Email Id :</b> </label>
        <input id="s4" type="email" name="emailid" id="emailid" >
        <br>
        <br>
        <label for="gender"><b> Gender : </b></label>
        <input id="s5" type="radio" name="gender" id="gender">Male
        <input  type="radio" name="gender" id="gender">Female

    </fieldset>
</form>
<br>
<br>


`
document.getElementById('table1').innerHTML=`
<h4 id="h5">Table</h4>
<table border="1">
    <tr>
        <td>Name : </td>
        <td>Shreyas</td>

    </tr>
    <tr>
            <td>Age : </td>
            <td>22</td>
    
        </tr>
        <tr>
                <td>Address : </td>
                <td>Goregaon, Mumbai</td>
        
            </tr>

            <tr>
                    <td>Date of birth : </td>
                    <td>25th May,1997</td>
            
                </tr>
                <tr>
                        <td>Email Id : </td>
                        <td>shreyassomani2\@gmail.com</td>
                
                    </tr>
                    <tr>
                            <td>Gender : </td>
                            <td>Male</td>
                    
                        </tr>
                
</table>`

//