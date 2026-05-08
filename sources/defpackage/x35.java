package defpackage;

import android.media.AudioRecord;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class x35 {
    public final String a;
    public AudioRecord b;
    public File c;
    public final String d;
    public final File e;
    public final ParcelFileDescriptor f;
    public ParcelFileDescriptor.AutoCloseOutputStream g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public boolean l;

    public static final class a {
        public static File a(String str, File file, int i) throws IOException {
            str.getClass();
            file.getClass();
            File file2 = new File(str);
            long length = file.length();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file2));
            long j = 36 + length;
            try {
                dataOutputStream.writeBytes("RIFF");
                dataOutputStream.writeInt(Integer.reverseBytes((int) j));
                dataOutputStream.writeBytes("WAVE");
                dataOutputStream.writeBytes("fmt ");
                dataOutputStream.writeInt(Integer.reverseBytes(16));
                dataOutputStream.writeShort(Short.reverseBytes((short) 1));
                dataOutputStream.writeShort(Short.reverseBytes((short) 1));
                dataOutputStream.writeInt(Integer.reverseBytes(i));
                dataOutputStream.writeInt(Integer.reverseBytes((i * 16) / 8));
                dataOutputStream.writeShort(Short.reverseBytes((short) 2));
                dataOutputStream.writeShort(Short.reverseBytes((short) 16));
                dataOutputStream.writeBytes("data");
                dataOutputStream.writeInt(Integer.reverseBytes((int) length));
                try {
                    dataOutputStream.write(hb5.S(file));
                    file.delete();
                } catch (IOException e) {
                    Log.e("ExpoAudioRecorder", "Failed to read PCM file", e);
                    e.printStackTrace();
                    j6g j6gVar = j6g.a;
                }
                dataOutputStream.close();
                return file2;
            } finally {
            }
        }
    }

    public x35(ReactApplicationContext reactApplicationContext, String str) throws IOException {
        this.a = str;
        this.d = l5.l("file://", str);
        File file = new File(reactApplicationContext.getCacheDir(), "temp_" + UUID.randomUUID() + ".pcm");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.e = file;
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
            parcelFileDescriptor.getClass();
            this.f = parcelFileDescriptor;
            this.g = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1]);
            this.h = 16000;
            this.i = 16;
            this.j = 2;
            this.k = AudioRecord.getMinBufferSize(16000, 16, 2);
        } catch (IOException e2) {
            Log.e("ExpoAudioRecorder", "Failed to create pipe", e2);
            e2.printStackTrace();
            throw e2;
        }
    }

    public final void a() {
        this.l = false;
        AudioRecord audioRecord = this.b;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        AudioRecord audioRecord2 = this.b;
        if (audioRecord2 != null) {
            audioRecord2.release();
        }
        this.b = null;
        String str = this.a;
        if (str != null) {
            try {
                this.c = a.a(str, this.e, this.h);
            } catch (IOException e) {
                Log.e("ExpoAudioRecorder", "Failed to append WAV header", e);
                e.printStackTrace();
            }
        }
        try {
            this.f.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        try {
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = this.g;
            if (autoCloseOutputStream != null) {
                autoCloseOutputStream.close();
            }
            this.g = null;
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
