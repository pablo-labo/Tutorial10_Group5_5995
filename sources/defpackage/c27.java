package defpackage;

import android.net.Uri;
import expo.modules.imagepicker.MediaType;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c27 {

    public static final class a extends c27 {
        public static final a a = new a();
    }

    public static final class b extends c27 {
        public static final b a = new b();
    }

    public static final class c extends c27 {
        public final List<Pair<MediaType, Uri>> a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Pair<? extends MediaType, ? extends Uri>> list) {
            this.a = list;
        }
    }
}
