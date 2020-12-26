package life.daguobiji.community.mapper;

import life.daguobiji.community.model.Comment;

public interface CommentExtMapper {

    int incCommentCount(Comment comment);
}