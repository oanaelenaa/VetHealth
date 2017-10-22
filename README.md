# VetHealth
MobileApp Course Repository Toma Elena oana group 933


                                 VetHealth- your personal veterinary & pet care asistent

 
          1.Business Information

* What is the purpose of the app or product?

The  main purpose of this app is to help picking the right vet for your furry friend, (as it may be be difficult to spot all the qualities you look for ) and facilitate the process of making appointments. The user can also hang out, share pictures and video of their best animal friend and also share experiences and opinions with other pet owners and experts, ask for advice or review the chosen veterinary services and doctors. However, even if you don’t have a pet yet and you are looking forward to, our app will give you the possibility to find  the suitable pet for your family, learn about the needs of different types of pets to find one that will best suit your lifestyle.


* What is the current problem(s) it will solve?
 
You may already go to a clinic that you are happy with, but many vets are increasingly passionate and knowledgeable about your specific breed or type of animal and they make efforts to minimise the stress of visit for your friend. Finding the right one may be sometimes difficult especially if you lack time to do a  research. Our app will provide you will all the needed information about the veterinary clinics in your nearby. Are you new in town and don’t have any friend yet to recommend you a good vet? We will help you search and filter the the local vets, hospitals clinics near your, based on reviews, accreditations and emergencies


	2.Technical and Functional Requirements

* Target OS Platforms.  
  
| Android |

* Native app development and database client library open sourced.

The product will be developed both in Android using Android Studio and React Native, which has components that have been created basically wrapping native Android functionality. For future releases, it may be also compatible on IOS.

The app will store data in the cloud, using Azure Cosmos DB for cloud database which also supports offline access to client  data.

* Features description (how the app behaves for the user)

                  Sign up/ registration and sign in

For creating an account, the user has to provide a minimum ???? of basic  information such as  complete name, e-mail address, date of birth, current city, phone number, and further details can be completed later.
After completing the registration form and choosing a password the user will be redirected to the main screen. The sign up can be also made using the Facebook account.
 The “forgot password” process will be handled by sending an e-mail which will redirect the user to the password changing screen.

                    Main screen

After signing in into application the user will be redirected to the main screen where you can see the main menu with available options for the current logged in user which will  such as: 
-   news feed/forum ( this will be loaded automatically when entering on the main screen)
-   notifications
-   serach 
-   petbook
-   profile settings


                  News feed/forum 
  The list of open questions, shared articles, related news, adoption posts,  photos, videos and also latest added reviews for vets. Th users can appreciate the post of leave a comment or share a post on facebook.
  
                  Notifications
  The Notifications section from the main menu will notify the currently logged in user if someone liked his posts and his appointments were confirmed, and also a reminder for the made appointments. 

                   Search 
  This option enables the user to search for a clinic/hospital by name and locate it on the map or search for the closest and nearby vets. The result of the search will be filtered by the positive reviews and type of specialisation. When choosing a vet the user can se the available doctors and their information such as timetable, activity area  and department, other  useful info about the vet clinic/ hospital and attached photos with the place. There will be also a chart with selected clinic activities and reviews in time.
     
                   PetBook 
   When this option is clicked on the main menu, the user is redirected to the page where he can see the information about his existing pets, such as : age, colour, breed, history of vaccines, treatments and appointments.Here user can add another pet by completing a form with related data. And also make an appointment to the chosen vet completing a short form with the problems or reason for visit, and if it is an emergency or not. He will receive a confirmation message in the Notifications section in the shortest time possible. 
     On this page there will a section where you can cancel or update an appointment.

                ProfileSettings
This page lets the user to update his profile information, change the password and see the vets and clinics he has registered  his pets at and is frequently visiting.
       

* Other optional features:
-  chat
- app version for doctors 
