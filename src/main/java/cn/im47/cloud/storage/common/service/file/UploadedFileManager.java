package cn.im47.cloud.storage.common.service.file;

import cn.im47.cloud.storage.common.entity.file.UploadedFile;
import cn.im47.cloud.storage.common.service.GenericAppManager;

import java.util.List;
import java.util.Map;

/**
 * 文件 Manager
 * <p/>
 * User: baitao.jibt@gmail.com
 * Date: 12-7-16
 * Time: 下午22:12
 */
public interface UploadedFileManager extends GenericAppManager<UploadedFile, Long> {

    UploadedFile get(String appKey, String fileKey);

    public List<UploadedFile> getByNode(String appKey, Long id, int offset, int limit);

    int updateBool(String appKey, Long id, String column);

    /**
     * Generic method used to get all objects of a particular type. This
     * is the same as lookup up all rows in a table.
     *
     * @return List of populated objects
     */
    List<UploadedFile> search(String appKey, Map<String, Object> parameters);

    /**
     * Generic method used to get all objects of a particular type. This
     * is the same as lookup up all rows in a table.
     *
     * @return List of populated objects
     */
    List<UploadedFile> search(String appKey, Map<String, Object> parameters, int offset, int limit);

}
