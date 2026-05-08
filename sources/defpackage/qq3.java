package defpackage;

import androidx.media3.common.a;
import defpackage.dye;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qq3 implements dye.a {
    @Override // dye.a
    public final boolean a(a aVar) {
        String str = aVar.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // dye.a
    public final int b(a aVar) {
        String str = aVar.n;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        l5.q(l5.l("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // dye.a
    public final dye c(a aVar) {
        String str = aVar.n;
        List<byte[]> list = aVar.q;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new ce4(list);
                case "application/pgs":
                    return new x9b();
                case "application/x-mp4-vtt":
                    return new a1a();
                case "text/vtt":
                    return new uxg();
                case "application/x-quicktime-tx3g":
                    return new nvf(list);
                case "text/x-ssa":
                    return new iqe(list);
                case "application/vobsub":
                    return new gtg(list);
                case "application/x-subrip":
                    return new gxe();
                case "application/ttml+xml":
                    return new yuf();
            }
        }
        l5.q(l5.l("Unsupported MIME type: ", str));
        return null;
    }
}
