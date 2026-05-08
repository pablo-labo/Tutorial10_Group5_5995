package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class cr6 extends ka6 {
    public static final Pattern f = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder d = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder e = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // defpackage.ka6
    public final js9 W(os9 os9Var, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.e;
        CharsetDecoder charsetDecoder2 = this.d;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new js9(new er6(bArr, null, null));
        }
        Matcher matcher = f.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strI = jh2.I(strGroup);
                strI.getClass();
                if (strI.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strI.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new js9(new er6(bArr, str, str2));
    }
}
