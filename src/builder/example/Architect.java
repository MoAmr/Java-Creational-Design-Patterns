package builder.example;

import java.awt.*;
import java.util.ArrayList;

public class Architect {

    public static void main(String[] args) {

//        Room room1 = new RoomBuilder().setFloorNumber(2).createRoom();
//        Room room2 = new RoomBuilder().setFloorNumber(1).createRoom();

//        ArrayList<Room> rooms = new RoomListBuilder().addList()
//                .addRoom(room1)
//                .addRoom(room2)
//                .buildList();
//
//        House house = new House(rooms);

        ArrayList<Room> rooms = new RoomListBuilder().addList()
                .addRoom().setFloorNumber(2).addRoomToList()
                .addRoom().setFloorNumber(1).addRoomToList()
                .buildList();

        House house = new House(rooms);
    }
}
