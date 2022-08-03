package com.djw.mygithubuserapp.database.local.entity

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "gthUser")

class User(
    @PrimaryKey
    @ColumnInfo(name = "username")
    val username: String,

    @ColumnInfo(name = "avatar_url")
    val avatar_url: String? = null,

    @ColumnInfo(name = "name")
    val name: String? = null,

    @ColumnInfo(name = "repository")
    val repository: Int? = null,

    @ColumnInfo(name = "company")
    val company: String? = null,

    @ColumnInfo(name = "location")
    val location: String? = null,

    @ColumnInfo(name = "followers")
    val followers: Int? = null,

    @ColumnInfo(name = "following")
    val following: Int? = null,

    @ColumnInfo(name = "favorite")
    var isFavorite: Boolean
)