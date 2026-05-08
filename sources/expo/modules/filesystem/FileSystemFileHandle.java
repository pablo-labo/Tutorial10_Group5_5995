package expo.modules.filesystem;

import expo.modules.kotlin.sharedobjects.SharedRef;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lexpo/modules/filesystem/FileSystemFileHandle;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Ljava/nio/channels/FileChannel;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemFileHandle extends SharedRef<FileChannel> implements AutoCloseable {
    public final FileChannel e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileSystemFileHandle(FileSystemFile fileSystemFile) {
        super(new RandomAccessFile(fileSystemFile.f0(), "rw").getChannel(), null);
        fileSystemFile.getClass();
        this.e = (FileChannel) this.c;
    }

    @Override // expo.modules.kotlin.sharedobjects.SharedObject
    public final void P() throws IOException {
        close();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.e.close();
    }
}
