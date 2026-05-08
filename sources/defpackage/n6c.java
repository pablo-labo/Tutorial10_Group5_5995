package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class n6c {

    public static final class a {
        public final UUID a;
        public final int b;
        public final byte[] c;
        public final UUID[] d;

        public a(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
            this.a = uuid;
            this.b = i;
            this.c = bArr;
            this.d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static a b(byte[] bArr) {
        UUID[] uuidArr;
        g4b g4bVar = new g4b(bArr);
        if (g4bVar.c < 32) {
            return null;
        }
        g4bVar.J(0);
        int iA = g4bVar.a();
        int iJ = g4bVar.j();
        if (iJ != iA) {
            zkd.T("PsshAtomUtil", "Advertised atom size (" + iJ + ") does not match buffer size: " + iA);
            return null;
        }
        int iJ2 = g4bVar.j();
        if (iJ2 != 1886614376) {
            g7.j(iJ2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iE = ll1.e(g4bVar.j());
        if (iE > 1) {
            g7.j(iE, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(g4bVar.r(), g4bVar.r());
        if (iE == 1) {
            int iB = g4bVar.B();
            uuidArr = new UUID[iB];
            for (int i = 0; i < iB; i++) {
                uuidArr[i] = new UUID(g4bVar.r(), g4bVar.r());
            }
        } else {
            uuidArr = null;
        }
        int iB2 = g4bVar.B();
        int iA2 = g4bVar.a();
        if (iB2 == iA2) {
            byte[] bArr2 = new byte[iB2];
            g4bVar.h(0, bArr2, iB2);
            return new a(uuid, iE, bArr2, uuidArr);
        }
        zkd.T("PsshAtomUtil", "Atom data size (" + iB2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] c(UUID uuid, byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        UUID uuid2 = aVarB.a;
        if (uuid.equals(uuid2)) {
            return aVarB.c;
        }
        zkd.T("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}
