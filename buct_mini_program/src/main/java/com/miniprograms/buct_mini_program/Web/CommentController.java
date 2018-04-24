package com.miniprograms.buct_mini_program.Web;

import com.miniprograms.buct_mini_program.entity.Comment;
import com.miniprograms.buct_mini_program.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/listcomment", method = RequestMethod.GET)
    private Map<String, Object> getComment() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Comment> commentList = commentService.getCommentList();
        modelMap.put("commentList", commentList);
        return modelMap;
    }
    @RequestMapping(value = "/addcomment", method = RequestMethod.POST)
    private Map<String, Object> addComment(@RequestBody Comment comment){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", commentService.addComment(comment));
        return modelMap;
    }
    @RequestMapping(value = "/removecomment", method = RequestMethod.GET)
    private Map<String, Object> removeComment(Integer cId){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", commentService.deleteComment(cId));
        return modelMap;
    }

}
