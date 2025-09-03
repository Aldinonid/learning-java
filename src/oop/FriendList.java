package oop;

class Friend {
	enum Gender {
		Male, Female
	}
	
	String name;
	byte age;
	Gender gender;
	String hobby;
	
    Friend(String name, byte age, Gender gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }
	
}

class FriendList {
	
	static float averageAge;
	static int totalUnderAverageAge;
	
	public static void main(String[] args) {
		Friend[] friends = {
			new Friend("Alice", (byte) 20, Friend.Gender.Female, "Reading"),
            new Friend("Bob", (byte) 30, Friend.Gender.Male, "Gaming"),
            new Friend("Charlie", (byte) 45, Friend.Gender.Male, "Cooking"),
            new Friend("Bowie", (byte) 15, Friend.Gender.Female, "Sleeping"),
		};
		totalFriendUnderAverageAge(friends);
		friendsAverageAge(friends);
		
		System.out.println("Friends average age is: " + averageAge);
		System.out.println("Total friends that under average: " + totalUnderAverageAge);
	}
	
	static void totalFriendUnderAverageAge(Friend[] friends) {
		for (Friend friend : friends) {
			System.out.println((float) friend.age);
			System.out.println(averageAge);
//			if ((float) friend.age < averageAge) { totalUnderAverageAge += 1; }
		}
	}
	
	static void friendsAverageAge(Friend[] friends) {
		for (Friend friend : friends) { averageAge += (float) friend.age; }
		averageAge = averageAge / friends.length;
	}
}
