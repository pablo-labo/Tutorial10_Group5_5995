package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface ns9 {
    public static final a a = new a();

    public class a implements ns9 {
        public final ka6 a(androidx.media3.common.a aVar) {
            String str = aVar.n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new yk0();
                    case "application/x-icy":
                        return new cr6();
                    case "application/id3":
                        return new fr6(null);
                    case "application/x-emsg":
                        return new h05();
                    case "application/x-scte35":
                        return new jpe();
                }
            }
            l5.q(l5.l("Attempted to create decoder for unsupported MIME type: ", str));
            return null;
        }

        public final boolean b(androidx.media3.common.a aVar) {
            String str = aVar.n;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
