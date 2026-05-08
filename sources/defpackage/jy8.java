package defpackage;

import androidx.media3.common.a;
import defpackage.e47;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class jy8 implements b61 {
    public final e47<b61> a;
    public final int b;

    public jy8(int i, qyc qycVar) {
        this.b = i;
        this.a = qycVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static jy8 b(int i, g4b g4bVar) {
        b61 jueVar;
        String str;
        e47.a aVar = new e47.a();
        int i2 = g4bVar.c;
        int iA = -2;
        while (g4bVar.a() > 8) {
            int iL = g4bVar.l();
            int iL2 = g4bVar.b + g4bVar.l();
            g4bVar.I(iL2);
            if (iL != 1414744396) {
                e61 e61Var = null;
                switch (iL) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iQ = g4bVar.q();
                                String str2 = iQ != 1 ? iQ != 85 ? iQ != 255 ? iQ != 8192 ? iQ != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iQ2 = g4bVar.q();
                                    int iL3 = g4bVar.l();
                                    g4bVar.K(6);
                                    int iQ3 = g4bVar.q();
                                    String str3 = vjg.a;
                                    int iB = vjg.B(iQ3, ByteOrder.LITTLE_ENDIAN);
                                    int iQ4 = g4bVar.a() > 0 ? g4bVar.q() : 0;
                                    a.C0036a c0036a = new a.C0036a();
                                    c0036a.m = st9.p(str2);
                                    c0036a.E = iQ2;
                                    c0036a.F = iL3;
                                    if (str2.equals("audio/raw") && iB != 0) {
                                        c0036a.G = iB;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iQ4 > 0) {
                                        byte[] bArr = new byte[iQ4];
                                        g4bVar.h(0, bArr, iQ4);
                                        c0036a.p = e47.n(bArr);
                                    }
                                    jueVar = new jue(new a(c0036a));
                                } else {
                                    g7.j(iQ, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                zkd.T("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(vjg.F(iA)));
                            }
                            jueVar = e61Var;
                            break;
                        } else {
                            g4bVar.K(4);
                            int iL4 = g4bVar.l();
                            int iL5 = g4bVar.l();
                            g4bVar.K(4);
                            int iL6 = g4bVar.l();
                            switch (iL6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                a.C0036a c0036a2 = new a.C0036a();
                                c0036a2.t = iL4;
                                c0036a2.u = iL5;
                                c0036a2.m = st9.p(str);
                                jueVar = new jue(new a(c0036a2));
                            } else {
                                g7.j(iL6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                jueVar = e61Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iL7 = g4bVar.l();
                        g4bVar.K(8);
                        int iL8 = g4bVar.l();
                        int iL9 = g4bVar.l();
                        g4bVar.K(4);
                        g4bVar.l();
                        g4bVar.K(12);
                        jueVar = new d61(iL7, iL8, iL9);
                        break;
                    case 1752331379:
                        int iL10 = g4bVar.l();
                        g4bVar.K(12);
                        g4bVar.l();
                        int iL11 = g4bVar.l();
                        int iL12 = g4bVar.l();
                        g4bVar.K(4);
                        int iL13 = g4bVar.l();
                        int iL14 = g4bVar.l();
                        g4bVar.K(4);
                        e61Var = new e61(iL10, iL11, iL12, iL13, iL14, g4bVar.l());
                        jueVar = e61Var;
                        break;
                    case 1852994675:
                        jueVar = new mue(g4bVar.v(g4bVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        jueVar = e61Var;
                        break;
                }
            } else {
                jueVar = b(g4bVar.l(), g4bVar);
            }
            if (jueVar != null) {
                if (jueVar.getType() == 1752331379) {
                    iA = ((e61) jueVar).a();
                }
                aVar.c(jueVar);
            }
            g4bVar.J(iL2);
            g4bVar.I(i2);
        }
        return new jy8(i, aVar.f());
    }

    public final <T extends b61> T a(Class<T> cls) {
        e47.b bVarListIterator = this.a.listIterator(0);
        while (bVarListIterator.hasNext()) {
            T t = (T) bVarListIterator.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // defpackage.b61
    public final int getType() {
        return this.b;
    }
}
