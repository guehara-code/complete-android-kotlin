package com.example.wishviewmodel.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DummyWish {
    val wishList = listOf(
        Wish(title="Goggle Watch 2", description = "An android watch"),
        Wish(title = "Oculus Quest2", description = "A VR headset for playing games"),
        Wish(title = "A Sci-fi, Book", description = "A science fiction book from any best seller"),
        Wish(title = "Bean bag", description = "A comfy bean bag to substitute a chair"),
    )
}
