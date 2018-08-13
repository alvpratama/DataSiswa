package com.dycode.edu.datasiswa;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by WINDOWS 10 on 12/08/2018.
 */

@Entity
public class SiswaModel implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "name")
    String name;

    @ColumnInfo(name = "address")
    String address;

    @ColumnInfo(name = "path_picture")
    String pathPicture;

    public SiswaModel(){

    }

    protected SiswaModel(Parcel in){
        id = in.readInt();
        name = in.readString();
        address = in.readString();
        pathPicture = in.readString();
    }

    public static final Parcelable.Creator<SiswaModel>CREATOR = new Parcelable.Creator<SiswaModel>() {
        @Override
        public SiswaModel createFromParcel(Parcel in) {
            return new SiswaModel(in);
        }

        @Override
        public SiswaModel[] newArray(int i) {
            return new SiswaModel[0];
        }
    };

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getPathPicture(){
        return pathPicture;
    }
    public void setPathPicture(String pathPicture){
        this.pathPicture=pathPicture;
    }

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i){
        parcel.writeInt(id);
        parcel.writeString(name);
        parcel.writeString(address);
        parcel.writeString(pathPicture);
    }
}
