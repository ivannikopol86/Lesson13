package org.example.lesson13;

public class RequestHttpTest {
    public static void main(String[] args) {
        RequestHttp http = new RequestHttp();
        System.out.println("http.isUserCreated() = " + http.isUserCreated());
        System.out.println("http.isUserUpdated() = " + http.isUserUpdated());
        System.out.println("http.isUserDeleted() = " + http.isUserDeleted());
        System.out.println("http.isGettingUsers() = " + http.isGettingUsers());
        System.out.println("http.isGettingUserById() = " + http.isGettingUserById());
        System.out.println("http.isGettingUserByUsername() = " + http.isGettingUserByUsername());
        System.out.println("http.isGettingCommetsAndWriteInToFile() = " + http.isGettingCommetsAndWriteInToFile());
        System.out.println("http.isGettingLastCommetAndWriteInToFile() = " + http.isGettingLastCommetAndWriteInToFile());
        System.out.println("http.isGettingIncomplitedTasks() = " + http.isGettingIncomplitedTasks());

    }
}
