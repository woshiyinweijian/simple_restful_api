package cn.ywj.simple_restful_api.one;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TTestController {

    /**
     * 列表请求
     * @param m
     * @param offset
     * @param limit
     * @return
     */
    @GetMapping("/m")
    public List<M> list(M m, Integer offset, Integer limit){
        // 处理逻辑
        return new ArrayList<M>();
    }

    /**
     * 单个请求
     * @param id 指定id
     * @return
     */
    @GetMapping("/m/{id}")
    public M get(@PathVariable("id") String id){
        // 假设找不到
        if(true){
            throw new NoFoundException("记录不存在");
        }
        // 处理逻辑
        return new M(id, "M1");
    }

    /**
     * 添加
     * @param m
     * @return
     */
    @PostMapping("/m")
    public ResponseEntity add(M m){
        // 处理逻辑
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * 修改
     * @param m 修改内容
     * @param id 修改的id
     * @return
     */
    @PutMapping("/m/{id}")
    public ResponseEntity update(M m, @PathVariable("id") String id){
        // 处理逻辑
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * 删除
     * @param id 指定id
     * @return
     */
    @DeleteMapping("/m/{id}")
    public ResponseEntity delete(@PathVariable("id") String id){
        // 处理逻辑
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
