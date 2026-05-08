package androidx.media3.session.legacy;

import android.os.Parcel;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c.h<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ c.i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, c.i iVar) {
        super(str);
        this.c = iVar;
    }

    @Override // androidx.media3.session.legacy.c.h
    public final void a() {
        this.c.a.detach();
    }

    @Override // androidx.media3.session.legacy.c.h
    public final void b(List<MediaBrowserCompat.MediaItem> list) {
        ArrayList arrayList;
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if (list2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(list2.size());
            for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                arrayList2.add(parcelObtain);
            }
            arrayList = arrayList2;
        }
        this.c.a(arrayList);
    }
}
