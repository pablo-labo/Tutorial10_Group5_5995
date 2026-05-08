package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import defpackage.pr1;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface t27 {

    public static final class a implements t27 {
        public final ByteBuffer a;
        public final List<ImageHeaderParser> b;
        public final kt0 c;

        public a(ByteBuffer byteBuffer, ArrayList arrayList, kt0 kt0Var) {
            this.a = byteBuffer;
            this.b = arrayList;
            this.c = kt0Var;
        }

        @Override // defpackage.t27
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new pr1.a(pr1.c(this.a)), null, options);
        }

        @Override // defpackage.t27
        public final void b() {
        }

        @Override // defpackage.t27
        public final int c() {
            ByteBuffer byteBufferC = pr1.c(this.a);
            kt0 kt0Var = this.c;
            if (byteBufferC != null) {
                List<ImageHeaderParser> list = this.b;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int iD = list.get(i).d(byteBufferC, kt0Var);
                        if (iD != -1) {
                            return iD;
                        }
                    } finally {
                        pr1.c(byteBufferC);
                    }
                }
            }
            return -1;
        }

        @Override // defpackage.t27
        public final ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.c(this.b, pr1.c(this.a));
        }
    }

    public static final class b implements t27 {
        public final com.bumptech.glide.load.data.c a;
        public final kt0 b;
        public final List<ImageHeaderParser> c;

        public b(vc9 vc9Var, ArrayList arrayList, kt0 kt0Var) {
            beb.e(kt0Var, "Argument must not be null");
            this.b = kt0Var;
            beb.e(arrayList, "Argument must not be null");
            this.c = arrayList;
            this.a = new com.bumptech.glide.load.data.c(vc9Var, kt0Var);
        }

        @Override // defpackage.t27
        public final Bitmap a(BitmapFactory.Options options) {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.a.a;
            recyclableBufferedInputStream.reset();
            return BitmapFactory.decodeStream(recyclableBufferedInputStream, null, options);
        }

        @Override // defpackage.t27
        public final void b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.a.a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.c = recyclableBufferedInputStream.a.length;
            }
        }

        @Override // defpackage.t27
        public final int c() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.a.a;
            recyclableBufferedInputStream.reset();
            return com.bumptech.glide.load.a.a(this.c, recyclableBufferedInputStream, this.b);
        }

        @Override // defpackage.t27
        public final ImageHeaderParser.ImageType d() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.a.a;
            recyclableBufferedInputStream.reset();
            return com.bumptech.glide.load.a.b(this.c, recyclableBufferedInputStream, this.b);
        }
    }

    public static final class c implements t27 {
        public final kt0 a;
        public final List<ImageHeaderParser> b;
        public final ParcelFileDescriptorRewinder c;

        public c(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, kt0 kt0Var) {
            beb.e(kt0Var, "Argument must not be null");
            this.a = kt0Var;
            beb.e(arrayList, "Argument must not be null");
            this.b = arrayList;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // defpackage.t27
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.c.c().getFileDescriptor(), null, options);
        }

        @Override // defpackage.t27
        public final void b() {
        }

        @Override // defpackage.t27
        public final int c() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            kt0 kt0Var = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), kt0Var);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    int iA = imageHeaderParser.a(recyclableBufferedInputStream, kt0Var);
                    recyclableBufferedInputStream.h();
                    parcelFileDescriptorRewinder.c();
                    if (iA != -1) {
                        return iA;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                    if (recyclableBufferedInputStream2 != null) {
                        recyclableBufferedInputStream2.h();
                    }
                    parcelFileDescriptorRewinder.c();
                    throw th;
                }
            }
            return -1;
        }

        @Override // defpackage.t27
        public final ImageHeaderParser.ImageType d() throws Throwable {
            RecyclableBufferedInputStream recyclableBufferedInputStream;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            kt0 kt0Var = this.a;
            List<ImageHeaderParser> list = this.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                RecyclableBufferedInputStream recyclableBufferedInputStream2 = null;
                try {
                    recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.c().getFileDescriptor()), kt0Var);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    ImageHeaderParser.ImageType imageTypeC = imageHeaderParser.c(recyclableBufferedInputStream);
                    recyclableBufferedInputStream.h();
                    parcelFileDescriptorRewinder.c();
                    if (imageTypeC != ImageHeaderParser.ImageType.UNKNOWN) {
                        return imageTypeC;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    recyclableBufferedInputStream2 = recyclableBufferedInputStream;
                    if (recyclableBufferedInputStream2 != null) {
                        recyclableBufferedInputStream2.h();
                    }
                    parcelFileDescriptorRewinder.c();
                    throw th;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
