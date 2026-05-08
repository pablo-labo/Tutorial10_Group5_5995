package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gz1 {
    public static void a(long j, g4b g4bVar, zpf[] zpfVarArr) {
        int i;
        while (true) {
            if (g4bVar.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (g4bVar.a() == 0) {
                    i = -1;
                    break;
                }
                int iX = g4bVar.x();
                i2 += iX;
                if (iX != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (g4bVar.a() == 0) {
                    i3 = -1;
                    break;
                }
                int iX2 = g4bVar.x();
                i3 += iX2;
                if (iX2 != 255) {
                    break;
                }
            }
            int i4 = g4bVar.b + i3;
            if (i3 == -1 || i3 > g4bVar.a()) {
                zkd.T("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = g4bVar.c;
            } else if (i == 4 && i3 >= 8) {
                int iX3 = g4bVar.x();
                int iD = g4bVar.D();
                int iJ = iD == 49 ? g4bVar.j() : 0;
                int iX4 = g4bVar.x();
                if (iD == 47) {
                    g4bVar.K(1);
                }
                boolean z = iX3 == 181 && (iD == 49 || iD == 47) && iX4 == 3;
                if (iD == 49) {
                    z &= iJ == 1195456820;
                }
                if (z) {
                    b(j, g4bVar, zpfVarArr);
                }
            }
            g4bVar.J(i4);
        }
    }

    public static void b(long j, g4b g4bVar, zpf[] zpfVarArr) {
        int iX = g4bVar.x();
        if ((iX & 64) != 0) {
            g4bVar.K(1);
            int i = (iX & 31) * 3;
            int i2 = g4bVar.b;
            for (zpf zpfVar : zpfVarArr) {
                g4bVar.J(i2);
                zpfVar.f(i, g4bVar);
                ka2.q(j != -9223372036854775807L);
                zpfVar.a(j, 1, i, 0, null);
            }
        }
    }
}
