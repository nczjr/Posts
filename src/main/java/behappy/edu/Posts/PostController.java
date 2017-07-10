package behappy.edu.Posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post addNewPost(@RequestBody Post toAdd) {
        Post newPost = new Post();
        newPost.setAuthor(toAdd.getAuthor());
        newPost.setContent(toAdd.getContent());
        return postRepository.save(newPost);
    }

    @GetMapping(value = "/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postRepository.findOne(id);
    }

    @GetMapping()
    public Iterable<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @PutMapping(value ="/{id}")
    public Post changePost(@PathVariable Long id, @RequestBody Post changedPost){
        Post oldPost = postRepository.findOne(id);
        oldPost.setContent(changedPost.getContent());
        return postRepository.save(oldPost);
    }


    @DeleteMapping(value = "/{id}")
    public void deletePostById(@PathVariable Long id) {
        postRepository.delete(id);
    }
}
