package ayds.songinfo.home.view

sealed class HomeUiEvent {
    data object Search : HomeUiEvent()
    data object MoreDetails : HomeUiEvent()
    data object OpenSongUrl : HomeUiEvent()
}