package androidx.media3.session.legacy;

import android.os.Parcel;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c.h<MediaBrowserCompat.MediaItem> {
    public final /* synthetic */ c.i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, c.i iVar) {
        super(str);
        this.c = iVar;
    }

    @Override // androidx.media3.session.legacy.c.h
    public final void a() {
        this.c.a.detach();
    }

    @Override // androidx.media3.session.legacy.c.h
    public final void b(MediaBrowserCompat.MediaItem mediaItem) {
        MediaBrowserCompat.MediaItem mediaItem2 = mediaItem;
        c.i iVar = this.c;
        if (mediaItem2 == null) {
            iVar.a(null);
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        mediaItem2.writeToParcel(parcelObtain, 0);
        iVar.a(parcelObtain);
    }
}
