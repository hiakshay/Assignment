# TrueCaller Assignement

- Used 100% Kotlin code. 
- Used MVVM architecture pattern.
- Followed solid design principles where required.

## Features
In this assignment Ui contains a button which makes three simultaneous requests. Fetches content from a webpage then:
1. Shows tenth character of it in a text view (here 10th char is ' ')
2. Shows count of words in the content
3. Show every tenth character as a list in a text view

## Workflow

Dependencies are constructed, injected & scoped using HILT. Classes also depend on abstractions rather than concrete implementations. Code also tries to follow clean architecture where use case is defined which is then used to manipulate data in repository. MainRepository gets data using retrofit(wrapper library made over okhttp client) which is then transformed using CharacterOperationUseCase. Mainrepository object is used to make request inside MainViewmodel. Mainviewmodel then exposes some live data to the main acivity which observes it and changes data in respective text views. I have also taken into consideration debouncing of button click which simply means there is only after certain amount of time button will cater click request (Check DebouncedOnClickListener)


PS: Feel free to email me if you have any doubts regarding decisions I made for this applications. I'd be very happy to share my opinion on same.