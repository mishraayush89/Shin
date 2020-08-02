package anime.stream.core.services

import anime.stream.core.services.models.Chapter
import anime.stream.core.services.models.Collection
import anime.stream.core.services.models.Manga
import io.reactivex.Observable

interface MangaNetworkService {

    fun getMangaTitles(): Observable<out Collection>

    fun searchManga(query: String, page: Int): Observable<out Collection>

    fun fetchMangaDetails(mangaId: String): Observable<out Manga>

    fun fetchChapterDetails(chapterId: String): Observable<out Chapter>
}
