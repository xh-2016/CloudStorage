package cn.im47.cloud.storage.common.service.file;

import cn.im47.cloud.storage.common.entity.file.Nodes;
import cn.im47.cloud.storage.common.service.GenericAppManager;

import java.util.List;

/**
 * 文件存储节点 Manager
 * <p/>
 * User: baitao.jibt@gmail.com
 * Date: 12-7-15
 * Time: 下午8:12
 */
public interface NodesManager extends GenericAppManager<Nodes, Long> {

    /**
     * 获取整个树
     *
     * @param appKey
     * @return
     */
    List<Nodes> getTree(String appKey);

    /**
     * 获取父节点
     *
     * @param appKey
     * @param id
     * @return
     */
    Nodes getParent(String appKey, Long id);

    /**
     * 获取子节点
     *
     * @param appKey
     * @param id
     * @return
     */
    List<Nodes> getChildren(String appKey, Long id);

}
