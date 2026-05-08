package androidx.media3.session.legacy;

import android.os.Bundle;
import android.os.Parcel;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c.h<List<MediaBrowserCompat.MediaItem>> {
    public final /* synthetic */ c.i c;
    public final /* synthetic */ Bundle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c.f fVar, String str, c.i iVar, Bundle bundle) {
        super(str);
        this.c = iVar;
        this.d = bundle;
    }

    @Override // androidx.media3.session.legacy.c.h
    public final void a() {
        this.c.a.detach();
    }

    @Override // androidx.media3.session.legacy.c.h
    public final void b(List<MediaBrowserCompat.MediaItem> list) {
        List<MediaBrowserCompat.MediaItem> listA = list;
        c.i iVar = this.c;
        if (listA == null) {
            iVar.a(null);
            return;
        }
        if (false & true) {
            listA = c.a(listA, this.d);
        }
        ArrayList arrayList = new ArrayList(listA == null ? 0 : listA.size());
        if (listA != null) {
            for (MediaBrowserCompat.MediaItem mediaItem : listA) {
                Parcel parcelObtain = Parcel.obtain();
                mediaItem.writeToParcel(parcelObtain, 0);
                arrayList.add(parcelObtain);
            }
        }
        iVar.a(arrayList);
    }
}
