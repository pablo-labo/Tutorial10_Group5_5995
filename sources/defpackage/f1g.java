package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface f1g {

    public static final class a {
        public final Uri a;
        public final String b;
        public final Long c;

        public a(Uri uri, String str, Long l) {
            uri.getClass();
            str.getClass();
            this.a = uri;
            this.b = str;
            this.c = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return wl7.b(this.a, aVar.a) && wl7.b(this.b, aVar.b) && wl7.b(this.c, aVar.c);
        }

        public final int hashCode() {
            int iD = akb.d(this.a.hashCode() * 31, 31, this.b);
            Long l = this.c;
            return iD + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            return "DownloadInfo(uri=" + this.a + ", fileName=" + this.b + ", fileAddedDate=" + this.c + ")";
        }
    }

    Object a(Activity activity, String str, String str2, Function1 function1, pu2 pu2Var);

    void b(FragmentManager fragmentManager, Context context, a aVar, gu5<? extends w0g> gu5Var);

    File c(Uri uri);
}
